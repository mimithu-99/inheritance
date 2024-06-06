package InheritancePackage;

public class Son extends Grandfather {
    public static void main(String[] args) {
        Son s = new Son();
        s.city();
        s.country();
        System.out.println(s.x);

    }
    public void activities(){
        System.out.println("Son activities");
    }

}


/*

// InheritancePackage নামে একটি প্যাকেজ ডিফাইন করা হচ্ছে
package InheritancePackage;

// Son নামের একটি ক্লাস ডিফাইন করা হচ্ছে, যা Grandfather ক্লাস থেকে উত্তরাধিকার (inheritance) লাভ করছে
public class Son extends Grandfather {

    // main মেথড ডিফাইন করা হচ্ছে, যা প্রোগ্রামের এন্ট্রি পয়েন্ট হিসেবে কাজ করবে
    public static void main(String[] args) {

        // Son ক্লাসের একটি নতুন অবজেক্ট s তৈরি করা হচ্ছে
        Son s = new Son();

        // s অবজেক্টের মাধ্যমে city মেথড কল করা হচ্ছে (এই মেথডটি Grandfather ক্লাসে ডিফাইন করা থাকতে পারে)
        s.city();

        // s অবজেক্টের মাধ্যমে country মেথড কল করা হচ্ছে (এই মেথডটি Grandfather ক্লাসে ডিফাইন করা থাকতে পারে)
        s.country();

        // s অবজেক্টের মাধ্যমে x প্রপার্টির মান প্রিন্ট করা হচ্ছে (এই প্রপার্টিটি Grandfather ক্লাসে ডিফাইন করা থাকতে পারে)
        System.out.println(s.x);

    }
    // activities নামের একটি মেথড ডিফাইন করা হচ্ছে, যা "Son activities" স্ট্রিংটি প্রিন্ট করবে
    public void activities() {
        System.out.println("Son activities");
    }
}


package InheritancePackage;

public class Grandfather {
    // x নামের একটি প্রপার্টি ডিফাইন করা হচ্ছে, যা একটি ইন্টিজার টাইপের
    int x = 100;

    // city নামের একটি মেথড ডিফাইন করা হচ্ছে, যা "City method in Grandfather class." স্ট্রিংটি প্রিন্ট করবে
    public void city() {
        System.out.println("City method in Grandfather class.");
    }

    // country নামের একটি মেথড ডিফাইন করা হচ্ছে, যা "Country method in Grandfather class." স্ট্রিংটি প্রিন্ট করবে
    public void country() {
        System.out.println("Country method in Grandfather class.");
    }
}





 */