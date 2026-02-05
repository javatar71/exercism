import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    Map<Integer, String> codesMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codesMap;
    }

    public void setDialingCode(Integer code, String country) { 
        this.codesMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.codesMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!this.codesMap.containsKey(code) 
            && !this.codesMap.containsValue(country))
        this.codesMap.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for(int code: this.codesMap.keySet()){
            if(this.codesMap.get(code) == country) return code;
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(int code_v: this.codesMap.keySet()){
            if(this.codesMap.get(code_v) == country){
                this.codesMap.remove(code_v);
                this.codesMap.put(code, country);
            }
        }
    }
}
