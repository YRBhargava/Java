package newPackage;




public class NewPackage {
    
        public static class Account {
            public String name;
            protected String email;
            private String password;
         
            public void setEmail(String email) {
                this.email = email;
            }
         
            public String getEmail(){
             return this.email;
            }

            public void setPassword(String password) {
                this.password = password;
            }
         
            public String getPassword(){
             return this.password;
            }
         }
         
}
