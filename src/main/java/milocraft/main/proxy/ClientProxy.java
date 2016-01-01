package milocraft.main.proxy;

import milocraft.main.init.*;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		Blocks.registerRenders();
		Items.registerRenders();
	}
}
