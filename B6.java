class User{
    private int userId;
    private String username;
    private String password;
    private String email;

    private boolean passwordValid = true;
    private boolean emailValid = true;

    public User(int userId , String username , String password , String email){
        this.userId = userId;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getUserId(){
        return userId;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public void setPassword(String password){
        if(password != null && !password.trim().isEmpty()){
            this.password = password;
            passwordValid = true;
        }else{
            this.password = password;
            passwordValid = false;
        }
    }

    public void setEmail(String email){
        if(email != null && email.contains("@")){
            this.email = email;
            emailValid = true;
        }else{
            this.email = email;
            emailValid = false;
        }
    }

    public void displayInfo(){
        System.out.println("Ma nguoi dung :"+userId);
        System.out.println("Ten nguoi dung :"+username);
        if(emailValid){
            System.out.println("Email :"+email);
        }else{
            System.out.println("Email khong hop le");
        }
        if(passwordValid){
            System.out.println("Password :"+password);
        }else{
            System.out.println("Password khong duoc rong");
        }
        System.out.println("--------------------");
    }
}

public class B6 {
    public static void main(String[] args){
        User user1 = new User(1 , "ngo quang anh" , "190303" , "ngoquanganh2003a@gmail.com");
        User user2 = new User(2 , "anh quang" , "" , "anhquang@gmail.com");
        User user3 = new User(3 , "quang anh" , "190303" , "anhquang");

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();
    }
}
