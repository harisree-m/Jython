import org.python.util.PythonInterpreter;

public class jythonproject {

    public static void main(String[] args) {
        PythonInterpreter pythonInterpreter = new PythonInterpreter();
        pythonInterpreter.exec("print('Hello from Jython!')");
    }
}