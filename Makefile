DOCKER_IMAGE=maven:3.8.6-openjdk-8
PROJECT_NAME=pixeldraw
TARGET_DIR=target
M2_VOLUME=$(HOME)/.m2:/root/.m2
JAR_FILE=$(shell find $(TARGET_DIR) -name "*.jar" | head -n 1)

build:
	@docker run --rm -v $(PWD):/app -v $(M2_VOLUME) -w /app $(DOCKER_IMAGE) mvn clean package -DskipTests

run: $(TARGET_DIR)/.built
	@if [ -z "$(JAR_FILE)" ]; then \
		echo "Error: JAR file not found in $(TARGET_DIR)"; \
		exit 1; \
	fi
	@java -jar $(JAR_FILE)

$(TARGET_DIR)/.built: build
	@touch $(TARGET_DIR)/.built

clean:
	@rm -rf $(TARGET_DIR)

build-run: build run