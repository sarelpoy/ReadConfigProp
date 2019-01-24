class ReadConfigProp
{
 public static T GetAppParam<T>(string configParam, ConversionFunction<T> conversionFunction ,T defaultValue)
 {
      T returnValue = defaultValue;
      string fromConfig = ConfigurationSettings.AppSettings[configParam]; ;
      try
      {
          returnValue = conversionFunction(fromConfig);
      }
      catch(Exception e)
      {
          Console.WriteLine(e.Message);
      }
      return returnValue;
 }
}
