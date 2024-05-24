(ns dots.typescript.server.protocol.module-kind
  (:require ["typescript" :as typescript]))

(def none (.. typescript/server -protocol -ModuleKind -None))

(def common-js (.. typescript/server -protocol -ModuleKind -CommonJS))

(def amd (.. typescript/server -protocol -ModuleKind -AMD))

(def umd (.. typescript/server -protocol -ModuleKind -UMD))

(def system (.. typescript/server -protocol -ModuleKind -System))

(def es-6 (.. typescript/server -protocol -ModuleKind -ES6))

(def es-2015 (.. typescript/server -protocol -ModuleKind -ES2015))

(def es-next (.. typescript/server -protocol -ModuleKind -ESNext))

(def node-16 (.. typescript/server -protocol -ModuleKind -Node16))

(def node-next (.. typescript/server -protocol -ModuleKind -NodeNext))

(def preserve (.. typescript/server -protocol -ModuleKind -Preserve))
