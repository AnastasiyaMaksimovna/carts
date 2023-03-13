import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class CartsTest {
    @Test
    public void cartsTestV1(){
      open("http://localhost:9999");
      $("span[data-test-id=name] input").setValue("Василий Пупкин");
      $("span[data-test-id=phone] input").setValue("+78903671425");
      $("[data-test-id=agreement]").click();
      $("button").click();
      $("p[data-test-id=order-success]").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

}
