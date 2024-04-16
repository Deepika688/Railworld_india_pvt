package Railworld_India_PVT_Task;

/** Public access modifier **/
class Account{
    public String name;
}
/** Defoult access modifier **/
class Account1{
    String name;
}

/** Protected access modifier **/
class Account2{
    public String name;
    protected String email;
}

/** private access modifier **/
class Account3 {
    public String name;
    protected String password;

    //getters & setters
    public String getPassword(){
        return  this.password;
    }
    public String setPassword(String pass){
        this.password = pass;
        return pass;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
Account account = new Account();
account.name = "Deepika Solanki";

        Account2 account1 = new Account2();
account1.email = "deepika@gmail.com";
    }
}
