(ns dots.typescript.module-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [module-declaration]
  (.-kind ^js module-declaration))

(defn parent
  ^js [module-declaration]
  (.-parent ^js module-declaration))

(defn modifiers
  ^js [module-declaration]
  (.-modifiers ^js module-declaration))

(defn name
  ^js [module-declaration]
  (.-name ^js module-declaration))

(defn body
  ^js [module-declaration]
  (.-body ^js module-declaration))

(defn flags
  ^js [module-declaration]
  (.-flags ^js module-declaration))

(defn source-file
  ^js [module-declaration]
  (.getSourceFile ^js module-declaration))

(defn child-count
  (^js [module-declaration]
   (.getChildCount ^js module-declaration))
  (^js [module-declaration source-file]
   (.getChildCount ^js module-declaration source-file)))

(defn child-at
  (^js [module-declaration index]
   (.getChildAt ^js module-declaration index))
  (^js [module-declaration index source-file]
   (.getChildAt ^js module-declaration index source-file)))

(defn children
  (^js [module-declaration]
   (.getChildren ^js module-declaration))
  (^js [module-declaration source-file]
   (.getChildren ^js module-declaration source-file)))

(defn start
  (^js [module-declaration]
   (.getStart ^js module-declaration))
  (^js [module-declaration source-file]
   (.getStart ^js module-declaration source-file))
  (^js [module-declaration source-file include-js-doc-comment?]
   (.getStart ^js module-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [module-declaration]
  (.getFullStart ^js module-declaration))

(defn get-end
  ^js [module-declaration]
  (.getEnd ^js module-declaration))

(defn width
  (^js [module-declaration]
   (.getWidth ^js module-declaration))
  (^js [module-declaration source-file]
   (.getWidth ^js module-declaration source-file)))

(defn full-width
  ^js [module-declaration]
  (.getFullWidth ^js module-declaration))

(defn leading-trivia-width
  (^js [module-declaration]
   (.getLeadingTriviaWidth ^js module-declaration))
  (^js [module-declaration source-file]
   (.getLeadingTriviaWidth ^js module-declaration source-file)))

(defn full-text
  (^js [module-declaration]
   (.getFullText ^js module-declaration))
  (^js [module-declaration source-file]
   (.getFullText ^js module-declaration source-file)))

(defn text
  (^js [module-declaration]
   (.getText ^js module-declaration))
  (^js [module-declaration source-file]
   (.getText ^js module-declaration source-file)))

(defn first-token
  (^js [module-declaration]
   (.getFirstToken ^js module-declaration))
  (^js [module-declaration source-file]
   (.getFirstToken ^js module-declaration source-file)))

(defn last-token
  (^js [module-declaration]
   (.getLastToken ^js module-declaration))
  (^js [module-declaration source-file]
   (.getLastToken ^js module-declaration source-file)))

(defn for-each-child
  (^js [module-declaration cb-node]
   (.forEachChild ^js module-declaration cb-node))
  (^js [module-declaration cb-node cb-node-array]
   (.forEachChild ^js module-declaration cb-node cb-node-array)))

(defn decorators
  ^js [module-declaration]
  (.-decorators ^js module-declaration))

(defn pos
  ^js [module-declaration]
  (.-pos ^js module-declaration))

(defn end
  ^js [module-declaration]
  (.-end ^js module-declaration))
