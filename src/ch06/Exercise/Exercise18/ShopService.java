package ch06.Exercise.Exercise18;

public class ShopService {
    static ShopService singleton = new ShopService();

    static ShopService getInstance() {
        return singleton;
    }
}
