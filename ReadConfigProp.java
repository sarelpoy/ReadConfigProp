public class ReadConfigProp {

  private Properties props = new Properties();
   private SystemConstants(String fileName) {
        try {
            input = new FileInputStream(fileName);
            props.load(input);
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
  }
    
  public <T> T getVariable(String variableName, T defaultValue, Function<String,T> conversionFunction){
        if(props.getProperty(variableName) !=null){
            try {
                String s =  props.getProperty(variableName);
                return conversionFunction.apply(s);
            }catch (Exception e){
                e.printStackTrace();
                return defaultValue;
            }
        }
        return defaultValue;
    }
}
