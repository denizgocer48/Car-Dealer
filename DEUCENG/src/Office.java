public class Office {
    private String ID;
    private String phone;
    private String address;
    private Employee employee;
    
    
        public String getID() {
            return ID;
        }
    
        public void setID(String ID) {
            this.ID = ID;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public void setPhone(String phNumber) {
        this.phone = phNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    //////////////////////////////////////////////////////
    Office[] offices = new Office[2];
    int top =0;
    public void push(Office a){

            offices[top]=a;
            top++;
    }
    public void show(){
        for (Office s :offices){
            System.out.println(s.employee.getName());
            System.out.println(s.ID);
            System.out.println(s.phone);
            System.out.println(s.address);
            System.out.println("---------------------------------------------");
        }
}}