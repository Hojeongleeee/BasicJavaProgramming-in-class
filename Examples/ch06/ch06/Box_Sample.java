public class Box_Sample {
	int width;
	int height;
	int depth;
	int volume;
	Box_Sample(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
	int volume_compute()
	{
		volume = width * height * depth;
		return volume;
	}
}