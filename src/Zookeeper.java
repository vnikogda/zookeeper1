public interface Zookeeper {
   void makeVoid(AbstractFdn abstractFdn) {
    System.out.println("I am a zookeeper and I ask the animal to follow a voice command");
        abstractFdn.voice();
    }
void makeSwim(AbstractFdn abstractFdn) {
        System.out.println("I am a zookeeper and I ask the animal to follow a swim command");
        abstractFdn.swim();
    }

   void makePlay(AbstractFdn abstractFdn) {
        System.out.println("I am a zookeeper and I ask the animal to follow a play command");
        abstractFdn.play();
    }
}
