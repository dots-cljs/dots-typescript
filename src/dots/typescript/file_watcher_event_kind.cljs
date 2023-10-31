(ns dots.typescript.file-watcher-event-kind
  (:require ["typescript" :as typescript]))

(def created (.-Created typescript/FileWatcherEventKind))

(def changed (.-Changed typescript/FileWatcherEventKind))

(def deleted (.-Deleted typescript/FileWatcherEventKind))
