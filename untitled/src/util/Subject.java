package util;

public class Subject {

    static class Student {
        private String id;
        private String name;
        private String lastname;
        private String family;
        private String birthDay;

        private Student() {
            // private constructor
        }

        public static Builder newBuilder() {
            return new Student().new Builder();
        }

        @Override
        public String toString() {
            return "id is " + id + "\n" + "name is " + name + "\n" + " lastnam is " + lastname + "\n" + " family is " + family + "\n" + " birthday is " + birthDay;
        }

        public void showInfo() {
            System.out.println(this.toString());
        }

        public class Builder {

            public Builder() {
                // private constructor
            }

            public Builder setUserId(String id) {
                Student.this.id = id;
                return this;
            }

            public Builder setNamen(String name) {
                Student.this.name = name;

                return this;
            }

            public Builder setLastname(String lastname) {
                Student.this.lastname = lastname;

                return this;
            }

            public Builder setFamily(String family) {
                Student.this.family = family;
                return this;
            }

            public Builder setBirthday(String birthday) {
                Student.this.birthDay = birthday;
                return this;
            }

            public Student build() {
                return Student.this;
            }
        }
    }

    static class Patient {
        private String id;
        private String name;
        private String lastname;
        private String family;
        private String adress;
        private String phoneNumber;
        private String cardNumber;
        private String diagnosis;

        public Patient(String id, String name, String lastname, String family, String adress, String phoneNumber, String cardNumber, String diagnosis) {

            this.id = id;
            this.name = name;
            this.lastname = lastname;
            this.family = family;
            this.adress = adress;
            this.phoneNumber = phoneNumber;
            this.cardNumber = cardNumber;
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return "id is " + id + "/n" + "name is " + name + "/n" + " lastnam is " + lastname + "/n" + " family is " + family + "/n" + " adress is " + adress + "/n" + " phonenumber is " + phoneNumber + "/n" + " cardnumber is " + cardNumber + "/n" + " diagnosis is " + diagnosis;
        }

        public void showInfo(Patient patient) {
            System.out.println(patient.toString());
        }
    }
}
