package InheritancePackage;

public class Grandson extends Son{
    public static void main(String[] args) {

    Grandson g = new Grandson();
    g.activities();
    g.country();
    g.city();


}
}
/*


// InheritancePackage নামে একটি প্যাকেজ ডিফাইন করা হচ্ছে
package InheritancePackage;

// Grandson নামের একটি ক্লাস ডিফাইন করা হচ্ছে, যা Son ক্লাস থেকে উত্তরাধিকার (inheritance) লাভ করছে
public class Grandson extends Son {

    // main মেথড ডিফাইন করা হচ্ছে, যা প্রোগ্রামের এন্ট্রি পয়েন্ট হিসেবে কাজ করবে
    public static void main(String[] args) {

        // Grandson ক্লাসের একটি নতুন অবজেক্ট g তৈরি করা হচ্ছে
        Grandson g = new Grandson();

        // g অবজেক্টের মাধ্যমে activities মেথড কল করা হচ্ছে (এই মেথডটি Son বা তার প্যারেন্ট ক্লাসে ডিফাইন করা থাকতে পারে)
        g.activities();

        // g অবজেক্টের মাধ্যমে country মেথড কল করা হচ্ছে (এই মেথডটি Son বা তার প্যারেন্ট ক্লাসে ডিফাইন করা থাকতে পারে)
        g.country();

        // g অবজেক্টের মাধ্যমে city মেথড কল করা হচ্ছে (এই মেথডটি Son বা তার প্যারেন্ট ক্লাসে ডিফাইন করা থাকতে পারে)
        g.city();
    }
}


package InheritancePackage;

public class Son {
    void activities() {
        System.out.println("Activities method in Son class.");
    }

    void country() {
        System.out.println("Country method in Son class.");
    }

    void city() {
        System.out.println("City method in Son class.");
    }
}

 */