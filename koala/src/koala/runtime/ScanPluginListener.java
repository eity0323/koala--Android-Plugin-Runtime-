package koala.runtime;

import java.util.ArrayList;

/**
 * ɨ�����ļ���
 * @author zhaoxuyang
 *
 */
public interface ScanPluginListener {
	public abstract void onScanStart();

	public abstract void onScanEnd(ArrayList<PluginInfo> paramArrayList);
}