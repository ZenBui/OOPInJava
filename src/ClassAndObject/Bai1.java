package ClassAndObject;

public class Bai1 {
    public static void main(String[] args) {
        Person person1, person2;
        person1 = new Person();
    }

    static class Person {
        private String name;
        private String ID;
        private float salary;
        private String address;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
