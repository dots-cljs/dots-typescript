(ns dots.typescript.server.errors
  (:require ["typescript" :as typescript]))

(defn throw-no-project
  "**Returns:** `never`"
  ^js []
  (.. typescript/server -Errors (ThrowNoProject)))

(defn throw-project-language-service-disabled
  "**Returns:** `never`"
  ^js []
  (.. typescript/server -Errors (ThrowProjectLanguageServiceDisabled)))

(defn throw-project-does-not-contain-document
  "**Parameters:**
   - `file-name`: `string`
   - `project`: `Project`
   
   **Returns:** `never`"
  ^js [file-name project]
  (.. typescript/server -Errors (ThrowProjectDoesNotContainDocument file-name project)))
