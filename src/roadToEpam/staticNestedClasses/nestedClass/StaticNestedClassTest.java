package roadToEpam.staticNestedClasses.nestedClass;

public class StaticNestedClassTest {

    private String outerClassName = "default";
    private static String staticOuterClassName = "outer static default";

    public StaticNestedClassTest(String outerClassName) {
        this.outerClassName = outerClassName;
    }

    public StaticNestedClassTest() {
    }

    public static void main(String[] args) {

        StaticNestedClassTest.StaticNestedClass nested = new StaticNestedClassTest.StaticNestedClass("Zonas");

    }

    static class StaticNestedClass{

        private String nestedName = "default nested name";
        static String staticNestedName = "default static nested name";

        public StaticNestedClass(String nestedName) {

            System.out.println("outer static name before constructor"+ staticOuterClassName);
            System.out.println("outer non static name before constructor" + new StaticNestedClassTest().outerClassName);
            System.out.println("outer  static name before constructor" + staticNestedName);
            System.out.println("-0--");
            this.nestedName = nestedName;
            staticOuterClassName = nestedName;
            StaticNestedClassTest st = new StaticNestedClassTest("Change outer class name from nested constructor");

            System.out.println("nested static name before constructor"+ staticOuterClassName);
            System.out.println("outer non static name before constructor" + st.outerClassName);
            System.out.println("outer  static name before constructor" + staticNestedName);

        }

        public String getNestedName() {
            return nestedName;
        }

        public void setNestedName(String nestedName) {
            this.nestedName = nestedName;
        }

        public static String getStaticNestedName() {
            return staticNestedName;
        }

        public static void setStaticNestedName(String staticNestedName) {
            StaticNestedClass.staticNestedName = staticNestedName;
            staticOuterClassName = "Name from nestedGetter";
        }
    }
}
