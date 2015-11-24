package helpers;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compiler {

    public String jarPath = "/extractedClass/vertx-core.jar";
    public String classPath = "/extractedClass/fatjar/destinationFolder/";
    public String destinationFolder = System.getProperty("user.dir") + "/src/test/java/compiledFiles/";

    public void compile(String pathToFile, String jarPath) throws IOException {
        File[] files1 = asFileArray(pathToFile);
        List<String> optionList = createOptions(jarPath);

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> compilationUnits1 =
                fileManager.getJavaFileObjectsFromFiles(Arrays.asList(files1));
        compiler.getTask(null, fileManager, null, optionList, null, compilationUnits1).call();

        fileManager.close();
    }

    private List<String> createOptions(String jarPath) {
        List<String> optionList = new ArrayList<String>();
        optionList.addAll(Arrays.asList("-classpath", System.getProperty("user.dir") + jarPath));
        optionList.addAll(Arrays.asList("-d", destinationFolder));
        return optionList;
    }

    private File[] asFileArray(String pathToFile) {
        File file = new File(pathToFile);
        return new File[]{file};
    }
}
