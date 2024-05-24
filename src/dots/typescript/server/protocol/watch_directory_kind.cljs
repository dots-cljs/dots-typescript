(ns dots.typescript.server.protocol.watch-directory-kind
  (:require ["typescript" :as typescript]))

(def use-fs-events (.. typescript/server -protocol -WatchDirectoryKind -UseFsEvents))

(def fixed-polling-interval (.. typescript/server -protocol -WatchDirectoryKind -FixedPollingInterval))

(def dynamic-priority-polling (.. typescript/server -protocol -WatchDirectoryKind -DynamicPriorityPolling))

(def fixed-chunk-size-polling (.. typescript/server -protocol -WatchDirectoryKind -FixedChunkSizePolling))
