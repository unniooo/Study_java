package N;

public class Login {


        public String username;
        public String password;

        public String getUsername () {
            return username;
        }

        public void setUsername (String username){
            this.username = username;
        }

        public String getPassword () {
            return password;
        }

        public void setPassword (String password){
            this.password = password;
        }

        public Login(String username) {
            this.username = username;
        }

}

