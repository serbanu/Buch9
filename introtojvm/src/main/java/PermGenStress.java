import javassist.ClassPool;

public class PermGenStress {

    public static void main(String[] args) throws Exception {
        try {
            for (int i = 0; i < 20_000; i++) {
                generate("eu.plumbr.demo.Generated" + i);
            }
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    public static Class generate(String name) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        return pool.makeClass(name).toClass();
    }
}
