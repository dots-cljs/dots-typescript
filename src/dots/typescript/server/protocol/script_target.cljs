(ns dots.typescript.server.protocol.script-target
  (:require ["typescript" :as typescript]))

(def es-3 (.. typescript/server -protocol -ScriptTarget -ES3))

(def es-5 (.. typescript/server -protocol -ScriptTarget -ES5))

(def es-6 (.. typescript/server -protocol -ScriptTarget -ES6))

(def es-2015 (.. typescript/server -protocol -ScriptTarget -ES2015))

(def es-2016 (.. typescript/server -protocol -ScriptTarget -ES2016))

(def es-2017 (.. typescript/server -protocol -ScriptTarget -ES2017))

(def es-2018 (.. typescript/server -protocol -ScriptTarget -ES2018))

(def es-2019 (.. typescript/server -protocol -ScriptTarget -ES2019))

(def es-2020 (.. typescript/server -protocol -ScriptTarget -ES2020))

(def es-2021 (.. typescript/server -protocol -ScriptTarget -ES2021))

(def es-2022 (.. typescript/server -protocol -ScriptTarget -ES2022))

(def es-next (.. typescript/server -protocol -ScriptTarget -ESNext))
