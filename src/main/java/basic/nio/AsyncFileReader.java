package basic.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class AsyncFileReader {

    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try {
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            long position = 0;
            Future<Integer> operation = fileChannel.read(buffer, position);

            while (!operation.isDone()) {
                //loop until operation is done
            }

            buffer.flip();
            byte[] data = new byte[buffer.limit()];
            buffer.get(data);
            System.out.println(new String(data));
            buffer.clear();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
