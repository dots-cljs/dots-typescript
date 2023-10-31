(ns dots.typescript.construct-signature-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [construct-signature-declaration]
  (.-kind ^js construct-signature-declaration))

(defn name
  ^js [construct-signature-declaration]
  (.-name ^js construct-signature-declaration))

(defn type-parameters
  ^js [construct-signature-declaration]
  (.-typeParameters ^js construct-signature-declaration))

(defn parameters
  ^js [construct-signature-declaration]
  (.-parameters ^js construct-signature-declaration))

(defn type
  ^js [construct-signature-declaration]
  (.-type ^js construct-signature-declaration))

(defn flags
  ^js [construct-signature-declaration]
  (.-flags ^js construct-signature-declaration))

(defn parent
  ^js [construct-signature-declaration]
  (.-parent ^js construct-signature-declaration))

(defn source-file
  ^js [construct-signature-declaration]
  (.getSourceFile ^js construct-signature-declaration))

(defn child-count
  (^js [construct-signature-declaration]
   (.getChildCount ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getChildCount ^js construct-signature-declaration source-file)))

(defn child-at
  (^js [construct-signature-declaration index]
   (.getChildAt ^js construct-signature-declaration index))
  (^js [construct-signature-declaration index source-file]
   (.getChildAt ^js construct-signature-declaration index source-file)))

(defn children
  (^js [construct-signature-declaration]
   (.getChildren ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getChildren ^js construct-signature-declaration source-file)))

(defn start
  (^js [construct-signature-declaration]
   (.getStart ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getStart ^js construct-signature-declaration source-file))
  (^js [construct-signature-declaration source-file include-js-doc-comment?]
   (.getStart ^js construct-signature-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [construct-signature-declaration]
  (.getFullStart ^js construct-signature-declaration))

(defn get-end
  ^js [construct-signature-declaration]
  (.getEnd ^js construct-signature-declaration))

(defn width
  (^js [construct-signature-declaration]
   (.getWidth ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getWidth ^js construct-signature-declaration source-file)))

(defn full-width
  ^js [construct-signature-declaration]
  (.getFullWidth ^js construct-signature-declaration))

(defn leading-trivia-width
  (^js [construct-signature-declaration]
   (.getLeadingTriviaWidth ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getLeadingTriviaWidth ^js construct-signature-declaration source-file)))

(defn full-text
  (^js [construct-signature-declaration]
   (.getFullText ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getFullText ^js construct-signature-declaration source-file)))

(defn text
  (^js [construct-signature-declaration]
   (.getText ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getText ^js construct-signature-declaration source-file)))

(defn first-token
  (^js [construct-signature-declaration]
   (.getFirstToken ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getFirstToken ^js construct-signature-declaration source-file)))

(defn last-token
  (^js [construct-signature-declaration]
   (.getLastToken ^js construct-signature-declaration))
  (^js [construct-signature-declaration source-file]
   (.getLastToken ^js construct-signature-declaration source-file)))

(defn for-each-child
  (^js [construct-signature-declaration cb-node]
   (.forEachChild ^js construct-signature-declaration cb-node))
  (^js [construct-signature-declaration cb-node cb-node-array]
   (.forEachChild ^js construct-signature-declaration cb-node cb-node-array)))

(defn pos
  ^js [construct-signature-declaration]
  (.-pos ^js construct-signature-declaration))

(defn end
  ^js [construct-signature-declaration]
  (.-end ^js construct-signature-declaration))

(defn question-token
  ^js [construct-signature-declaration]
  (.-questionToken ^js construct-signature-declaration))
