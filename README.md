# wire2json
    将protobuf的wire版本转为json。
    
    为什么用Wire而不用Google原生的protobuf，因为Android的方法数限制，而原生的protobuf使用的方法数实在是太多了，于是只能投向Wire。
    
    然而Wire没有支持转JSON的方法，于是有了这个库。
    
    jar包在project/out/artifacts中

#使用方式：

    Wire2Json.toJson(message);

    Wire2Json.toJsonString(message);

    由于很多时候java需要转JSON的场景都是给JavaScript使用，而Java的long是64位，而JavaScript的number的整数部分只有53位，所以有时会发生精度丢失的情况，所以提供设置，可以将long转为string：
    
    Wire2Json.toJson(message,true);
