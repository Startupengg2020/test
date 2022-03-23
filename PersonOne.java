package capgemini;

import java.util.Scanner;

public class PersonOne {
    private String name;
    private String dateOfBirth;
    private String gender;
    private  String mobileNumber;
    private String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }



}


class Donor extends PersonOne{
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }
    public void displayDonationDetails(){
        System.out.println("Name             :  "+getName());
        System.out.println("Date of Brith    :  "+getDateOfBirth());
        System.out.println("Gender           :  "+getGender());
        System.out.println("Mobile Number    :  "+getMobileNumber());
        System.out.println("Blood Group      :  "+getBloodGroup());
        System.out.println("Blood Bank name  :  "+getBloodBankName());
        System.out.println("Donor Type       :  "+getDonorType());
        System.out.println("Donation Date    :  "+getDonationDate());

    }






}

class Main{
    public static void main(String[] args) {
        Donor P1 = new Donor();




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        P1.setName(sc.next());

        System.out.println("Enter date of Birth : ");
        P1.setDateOfBirth(sc.next());

        System.out.println("Enter Gender : ");
        P1.setGender(sc.next());

        System.out.println("Enter mobile number  : ");
        P1.setMobileNumber(sc.next());

        System.out.println("Enter Blood Group  : ");
        P1.setBloodGroup(sc.next());

        System.out.println("Enter Bank name  : ");
        P1.setBloodBankName(sc.next());

        System.out.println("Enter Donor type  : ");
        P1.setDonorType(sc.next());

        System.out.println("Enter Donation Date  : ");
        P1.setDonationDate(sc.next());

        P1.displayDonationDetails();


    }
}