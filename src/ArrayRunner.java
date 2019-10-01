public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);

        Student[] myClass = new Student[12];

        Student studentA = new Student("Isabelle", "April", "pink");
        myClass[2] = studentA;

        Student studentB = new Student("Lydia", "October", "purple");
        myClass[0] = studentB;

        System.out.println(myClass[2]);
        System.out.println(myClass[0]);

        for (int i=0; i<4; i++)
        {
            System.out.println(myClass[i]);
        }

        //makes array and fills stuff in as it does it
        //can only use {} when making array
        String[] names = {"Michael", "Brian", "Duncan", "Bennett", "Martin",
                "Jessica", "Lexy", "Zoe", "Jimmy", "Sanjit", "Andrew", "Will"};
        String[] months = {"February", "October", "March", "September", "July",
                "February", "November", "December", "August", "May", "September", "December"};
        String[] colors = {"Green", "Fuchsia", "Purple", "Turquoise", "Cyan",
                "Purple", "Pink", "Indigo", "Green", "Blue", "Green", "Space"};

        for (int i=0; i<12; i++)
        {
            myClass[i] = new Student(names[i], months[i], colors[i]);
        }

        System.out.println("Print out the students!");
        for (Student s: myClass) //prints out whole list of students
        {
            if (s.getName().equals("Martin"))
            {
                System.out.print("*****");
            }
            System.out.println(s);
        }

        System.out.println(myClass[7]);

        System.out.println(myClass); //just prints out where the array is in the computer

        System.out.println("There are "+names.length + " names on the list.");

        //names[15] = "Mr. Howe"; **cannot do this! array already made w/ 12**
        //names[12] = "Mr. Howe"; **12 spaces, but starts at zero**
        names[11] = "Mr. Howe"; //will work, overwrites "Will"
    }
}
