public class Teacher extends Person{
    // name, age, display information.

    String qualification;

    void displayInformation2(){
        System.out.println("The name is: " +name);
        System.out.println("Age is: " + age);
        System.out.println("Qualification is: " + qualification);
    }
}
/*
// Teacher ক্লাসটি ডিফাইন করা হচ্ছে, যা Person ক্লাস থেকে উত্তরাধিকার (inheritance) লাভ করছে
public class Teacher extends Person {

    // Teacher ক্লাসের একটি প্রপার্টি ডিফাইন করা হচ্ছে, যার নাম qualification
    String qualification;

    // displayInformation2 নামের একটি মেথড ডিফাইন করা হচ্ছে, যা Teacher ক্লাসের ইনফরমেশন প্রিন্ট করবে
    void displayInformation2() {

        // name প্রপার্টি থেকে প্রাপ্ত মান প্রিন্ট করা হচ্ছে (এই প্রপার্টিটি Person ক্লাস থেকে ইনহেরিট করা হয়েছে)
        System.out.println("The name is: " + name);

        // age প্রপার্টি থেকে প্রাপ্ত মান প্রিন্ট করা হচ্ছে (এই প্রপার্টিটি Person ক্লাস থেকে ইনহেরিট করা হয়েছে)
        System.out.println("Age is: " + age);

        // qualification প্রপার্টি থেকে প্রাপ্ত মান প্রিন্ট করা হচ্ছে (এই প্রপার্টিটি Teacher ক্লাসে ডিফাইন করা হয়েছে)
        System.out.println("Qualification is: " + qualification);
    }
}

 */