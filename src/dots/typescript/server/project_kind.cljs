(ns dots.typescript.server.project-kind
  (:require ["typescript" :as typescript]))

(def inferred (.. typescript/server -ProjectKind -Inferred))

(def configured (.. typescript/server -ProjectKind -Configured))

(def external (.. typescript/server -ProjectKind -External))

(def auto-import-provider (.. typescript/server -ProjectKind -AutoImportProvider))

(def auxiliary (.. typescript/server -ProjectKind -Auxiliary))
