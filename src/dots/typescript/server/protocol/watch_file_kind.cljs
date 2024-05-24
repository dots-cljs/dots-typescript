(ns dots.typescript.server.protocol.watch-file-kind
  (:require ["typescript" :as typescript]))

(def fixed-polling-interval (.. typescript/server -protocol -WatchFileKind -FixedPollingInterval))

(def priority-polling-interval (.. typescript/server -protocol -WatchFileKind -PriorityPollingInterval))

(def dynamic-priority-polling (.. typescript/server -protocol -WatchFileKind -DynamicPriorityPolling))

(def fixed-chunk-size-polling (.. typescript/server -protocol -WatchFileKind -FixedChunkSizePolling))

(def use-fs-events (.. typescript/server -protocol -WatchFileKind -UseFsEvents))

(def use-fs-events-on-parent-directory (.. typescript/server -protocol -WatchFileKind -UseFsEventsOnParentDirectory))
