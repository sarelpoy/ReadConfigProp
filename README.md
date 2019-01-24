# ReadConfigProp
Read Config Property function C# or Java
Advantage in use:
Make sure that the type is correct
Easy to set default value

Java Example(Note: need to define configFile first):
int timeout= ReadConfigProp.getVariable("timeout",1000,Integer::valueOf);

C# Example:
int timeout = ReadConfigProp.GetAppParam<int>("timeout", int.Parse,1000);

