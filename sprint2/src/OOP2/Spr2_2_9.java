package OOP2;

// параметр this нужен для назначения переданного параметру, новому параметру с таким же именем

public class Spr2_2_9 {
    public static void main(String[] args) {
        Bot bot = new Bot("Tarantino", "Criminale");
        ChannelBot channelBot = new ChannelBot(bot, "nothing to move");
    }
}

class Bot {
    String name;
    String specialization;

    public Bot(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }
}

class ChannelBot extends Bot{
    String channel;

    public ChannelBot(Bot bot, String channel){
        super(bot.name, bot.specialization);
        this.channel = channel;
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Channel: " + channel);
    }
}