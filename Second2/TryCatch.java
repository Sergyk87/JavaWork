package Second2;

public class TryCatch {
    public static void main(String[] args) {
        try {  // потенциально взрывоопасный код идет сюда
            // основной успешный сценарий
            int a = 5, b = 0;
            System.out.println(a / b);
        }
        catch (Exception ex) {  // что делать, если ошибка все же наступила
            System.out.println(ex); // рассказать об ошибке
            System.exit (0);
        }
        finally {  //всегда, была ли ошибка или нет
            //  вернуть ресурсы в систему: например закрыть файл

        }
    }
    
}
