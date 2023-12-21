package net.luke.shipments;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shipments implements ModInitializer {
	public static final String modID = "shipments";
    public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}