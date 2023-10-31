(ns dots.typescript.import-equals-declaration
  "One of:
   - import x = require(\"mod\");
   - import x = M.x;"
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [import-equals-declaration]
  (.-kind ^js import-equals-declaration))

(defn parent
  ^js [import-equals-declaration]
  (.-parent ^js import-equals-declaration))

(defn modifiers
  ^js [import-equals-declaration]
  (.-modifiers ^js import-equals-declaration))

(defn name
  ^js [import-equals-declaration]
  (.-name ^js import-equals-declaration))

(defn type-only?
  ^js [import-equals-declaration]
  (.-isTypeOnly ^js import-equals-declaration))

(defn module-reference
  ^js [import-equals-declaration]
  (.-moduleReference ^js import-equals-declaration))

(defn flags
  ^js [import-equals-declaration]
  (.-flags ^js import-equals-declaration))

(defn source-file
  ^js [import-equals-declaration]
  (.getSourceFile ^js import-equals-declaration))

(defn child-count
  (^js [import-equals-declaration]
   (.getChildCount ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getChildCount ^js import-equals-declaration source-file)))

(defn child-at
  (^js [import-equals-declaration index]
   (.getChildAt ^js import-equals-declaration index))
  (^js [import-equals-declaration index source-file]
   (.getChildAt ^js import-equals-declaration index source-file)))

(defn children
  (^js [import-equals-declaration]
   (.getChildren ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getChildren ^js import-equals-declaration source-file)))

(defn start
  (^js [import-equals-declaration]
   (.getStart ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getStart ^js import-equals-declaration source-file))
  (^js [import-equals-declaration source-file include-js-doc-comment?]
   (.getStart ^js import-equals-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [import-equals-declaration]
  (.getFullStart ^js import-equals-declaration))

(defn get-end
  ^js [import-equals-declaration]
  (.getEnd ^js import-equals-declaration))

(defn width
  (^js [import-equals-declaration]
   (.getWidth ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getWidth ^js import-equals-declaration source-file)))

(defn full-width
  ^js [import-equals-declaration]
  (.getFullWidth ^js import-equals-declaration))

(defn leading-trivia-width
  (^js [import-equals-declaration]
   (.getLeadingTriviaWidth ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getLeadingTriviaWidth ^js import-equals-declaration source-file)))

(defn full-text
  (^js [import-equals-declaration]
   (.getFullText ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getFullText ^js import-equals-declaration source-file)))

(defn text
  (^js [import-equals-declaration]
   (.getText ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getText ^js import-equals-declaration source-file)))

(defn first-token
  (^js [import-equals-declaration]
   (.getFirstToken ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getFirstToken ^js import-equals-declaration source-file)))

(defn last-token
  (^js [import-equals-declaration]
   (.getLastToken ^js import-equals-declaration))
  (^js [import-equals-declaration source-file]
   (.getLastToken ^js import-equals-declaration source-file)))

(defn for-each-child
  (^js [import-equals-declaration cb-node]
   (.forEachChild ^js import-equals-declaration cb-node))
  (^js [import-equals-declaration cb-node cb-node-array]
   (.forEachChild ^js import-equals-declaration cb-node cb-node-array)))

(defn pos
  ^js [import-equals-declaration]
  (.-pos ^js import-equals-declaration))

(defn end
  ^js [import-equals-declaration]
  (.-end ^js import-equals-declaration))
