package pro.sky.java.course1.lesson2_2;

    class Bicycle extends Vehicles {


        protected Bicycle(String modelName, int wheelsCount) {
            super(modelName, wheelsCount);
        }

        @Override
        protected void check(Vehicles vehicles) {
            System.out.println("Обслуживаем2 " + vehicles.getModelName());
            for (int i = 0; i < vehicles.getWheelsCount(); i++) {
                vehicles.updateTyre();

            }

        }

    }
