(ns dots.typescript.watch-directory-kind
  (:require ["typescript" :as typescript]))

(def use-fs-events (.-UseFsEvents typescript/WatchDirectoryKind))

(def fixed-polling-interval (.-FixedPollingInterval typescript/WatchDirectoryKind))

(def dynamic-priority-polling (.-DynamicPriorityPolling typescript/WatchDirectoryKind))

(def fixed-chunk-size-polling (.-FixedChunkSizePolling typescript/WatchDirectoryKind))
