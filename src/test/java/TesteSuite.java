
import figuras.TestFigura;
import figuras.TestCirculo;
import figuras.TestQuadrado;
import figuras.TestRetangulo;
import figuras.TestTriangulo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestFigura.class, TestTriangulo.class, TestRetangulo.class, TestQuadrado.class, TestCirculo.class})
public class TesteSuite {

}