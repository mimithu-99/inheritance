public class Test1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.name = "Eshad";
        t1.age = 30;
        t1.qualification = "Software Engineer";

        System.out.println("Name " +t1.name);
        System.out.println("Age " + t1.age);
        System.out.println("Qualification " + t1.qualification);


    }
}
/*

public class Test1 {
    public static void main(String[] args) {
        // Teacher ক্লাসের একটি নতুন অবজেক্ট t1 তৈরি করা হচ্ছে
        Teacher t1 = new Teacher();

        // t1 অবজেক্টের name প্রপার্টিতে "Eshad" মান সেট করা হচ্ছে
        t1.name = "Eshad";

        // t1 অবজেক্টের age প্রপার্টিতে 30 মান সেট করা হচ্ছে
        t1.age = 30;

        // t1 অবজেক্টের qualification প্রপার্টিতে "Software Engineer" মান সেট করা হচ্ছে
        t1.qualification = "Software Engineer";

        // t1 অবজেক্টের name প্রপার্টির মান প্রিন্ট করা হচ্ছে
        System.out.println("Name " + t1.name);

        // t1 অবজেক্টের age প্রপার্টির মান প্রিন্ট করা হচ্ছে
        System.out.println("Age " + t1.age);

        // t1 অবজেক্টের qualification প্রপার্টির মান প্রিন্ট করা হচ্ছে
        System.out.println("Qualification " + t1.qualification);
    }
}


 */