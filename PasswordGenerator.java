public class PasswordGenerator {
    private static char symbs[] = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '=',
                      '<', '>', '/', '\\', '~', '`', '"', '{', '}', '[', ']', '|', '?',
                      ':', '\'', '§'};
    private static int lSymbs = symbs.length;
    private static StringBuffer password = new StringBuffer("");


    public static void generate(int num, byte len, String userInput){
        for(int i = 0; i<num; i++){
            if(userInput.equals("0001")) for(int j = 0; j<len; j++) password.append((int)Math.random()*10);
            else if(userInput.equals("0010")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96) password.append((char)rn);
            }
            else if(userInput.equals("0011")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if((rn>47 && rn<58) || rn>96) password.append((char)rn);
            }
            else if(userInput.equals("0100")) while(password.length() != len){
                byte rn = (byte)(Math.random()*91);
                if(rn>64) password.append((char)rn);
            }
            else if(userInput.equals("0101")) while(password.length() != len){
                byte rn = (byte)(Math.random()*91);
                if(rn>64 || (rn>47 && rn<58)) password.append((char)rn);
            }
            else if(userInput.equals("0110")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96 || (rn>64 && rn<90)) password.append((char)rn);
            }
            else if(userInput.equals("0111")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96 || (rn>64 && rn<91) || (rn>47 && rn<58)) password.append((char)rn);
            }
            else if(userInput.equals("1000")) while(password.length() != len) password.append(symbs[(int)(Math.random()*lSymbs)]);
            else if(userInput.equals("1001")) while(password.length() != len){
                byte rn = (byte)(Math.random()*58);
                if(rn>47) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            else if(userInput.equals("1010")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            else if(userInput.equals("1011")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96 || (rn>47 && rn<58)) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            else if(userInput.equals("1100")) while(password.length() != len){
                byte rn = (byte)(Math.random()*91);
                if(rn>64) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            else if(userInput.equals("1101")) while(password.length() != len){
                byte rn = (byte)(Math.random()*91);
                if(rn>64 || (rn>47 && rn<58)) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            else if(userInput.equals("1110")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96 || (rn>64 && rn<91)) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            else if(userInput.equals("1111")) while(password.length() != len){
                byte rn = (byte)(Math.random()*123);
                if(rn>96 || (rn>64 && rn<91) || (rn>47 && rn<58)) password.append((char)rn);
                else password.append(symbs[(int)(Math.random()*lSymbs)]);
            }
            if(password.length() == 0) System.out.println("empty");
            else {
                System.out.println(password+"\n");
                password.delete(0, password.length()-1);
            }
        }
    }
}
