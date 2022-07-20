package dev.kejona.bedrockformshop.handlers;

public enum ShopType {

    ITEM {
        @Override
        public String toString() {
            return "ITEM";
        }
    },
    COMMAND {
        @Override
        public String toString() {
            return "COMMAND";
        }
    },
    ENCHANTMENT {
        @Override
        public String toString() {
            return "ENCHANTMENT";
        }
    },
    POTION {
        @Override
        public String toString() {
            return "POTION";
        }
    },
}