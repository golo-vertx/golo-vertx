package io.vertx.golo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class FindUniqueFunctionNameTest {

    private String exampleFilePath = "/generated/golo/io/vertx/golo/core/buffer/Buffer.golo";
    private List<String> exampleFileContent;

    @Before
    public void setUp() throws IOException {
        Path absPath = Paths.get(System.getProperty("user.dir") + exampleFilePath);
        exampleFileContent = Files.readAllLines(absPath);
    }

    @Test
    public void uniqueFunctionNames() {
        HashSet<String> set = new HashSet<>();
        boolean allunique = exampleFileContent
                .stream().filter((row) -> {
                    return row.contains("function ");
                }).map((row) -> {
                    return row.split(" ")[1];
                }).allMatch((row) -> {
                    if (set.contains(row)) {
                        return false;
                    }
                    set.add(row);
                    return true;
                });
        Assert.assertTrue(allunique);
    }
}
