(ns dots.typescript.server.protocol.module-resolution-kind
  (:require ["typescript" :as typescript]))

(def classic (.. typescript/server -protocol -ModuleResolutionKind -Classic))

(def node (.. typescript/server -protocol -ModuleResolutionKind -Node))

(def node-10 (.. typescript/server -protocol -ModuleResolutionKind -Node10))

(def node-16 (.. typescript/server -protocol -ModuleResolutionKind -Node16))

(def node-next (.. typescript/server -protocol -ModuleResolutionKind -NodeNext))

(def bundler (.. typescript/server -protocol -ModuleResolutionKind -Bundler))
