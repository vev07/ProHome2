package Theory.Task2;

public enum City {
    BERLIN("Берлин") {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    PARIS("Париж") {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    LONDON("Лондон") {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    RIGA("Рига") {
        @Override
        public boolean isPopular() {
            return false;
        }
    },
    MADRID("Мадрид") {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    ROME("Рим") {
        @Override
        public boolean isPopular() {
            return true;
        }
    },
    LISBON("Лисобон") {
        @Override
        public boolean isPopular() {
            return false;
        }
    };


   String rusName;

    City() {
        System.out.println("Constructor city is using");
    }

    @Override
    public String toString() {
        return "City{" +
                "rusName='" + rusName + '\'' +
                '}';
    }

    City(String rusName) {
        System.out.println("Constructor city with rusName is using");
        this.rusName = rusName;
    }
    public abstract boolean isPopular();


}
