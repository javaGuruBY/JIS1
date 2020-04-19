package userInterface;

/**
 * Тут я планирую зае****ть ахененное меню,
 * но пока только проектирую
 */
public enum Menu {
    CLOSE_PROGRAM {
        public String description() {
            return "0. Завершить выполнение программы";
        }
    },
    ADD_PRODUCT {
        public String description() {
            return "1. Добавить продукт";
        }
    },
    FIND_PRODUCT_BY_ID {
        public String description() {
            return "2. Найти продукт по ID";
        }
    },
    SHOW_ALL_PRODUCTS {
        public String description() {
            return "3. Отобразить все продукты";
        }
    },
    FIND_AND_DELETE_PRODUCT {
        public String description() {
            return "4. Отобразить все продукты";
        }
    },
    FIND_AND_CHANGE_PRICE {
        public String description() {
            return "5. Найти и изменить цену продукта";
        }
    },
    SET_PRODUCT_DISCOUNT {
        public String description() {
            return "6. Установить скидку на продукт";
        }
    },
    ADD_PRODUCT_DESCRIPTION {
        public String description() {
            return "7. Добавить описание продукта";
        }
    };

    
    public String itemDescription() {
        return null;
    }
}
