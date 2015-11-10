package com.mean.wire2json;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.mean.proto.Company;
import com.mean.proto.Person;
import okio.ByteString;
import java.util.ArrayList;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        test();
    }

    private void test() {
        Company.Builder companyBuilder = new Company.Builder();
        ByteString signature = ByteString.encodeUtf8("中文english");
        companyBuilder.company_name("CompanyName公司名字").is_public(true).profit(12345678987654321987654321.8765).signature(signature);
        //增加十个员工数据
        ArrayList<Person> staffs = new ArrayList<Person>();
        for (int i = 0;i < 5;i ++){
            Person.Builder personBuilder = new Person.Builder();
            personBuilder.age(i + 18).name("员工" + (i+1)).sex(i % 2 + 1).title("工程师").salary(12000L);
            Person person = personBuilder.build();
            staffs.add(person);
        }
        companyBuilder.staffs(staffs);
        Company company = companyBuilder.build();
        String json = Wire2Json.toJsonString(company);
        Log.d("normal",json);
        json = Wire2Json.toJsonString(company,true);
        Log.d("long2String",json);
    }
}
