(ns dots.typescript.solution-builder)

(defn build
  (^js [solution-builder]
   (.build ^js solution-builder))
  (^js [solution-builder project]
   (.build ^js solution-builder project))
  (^js [solution-builder project cancellation-token]
   (.build ^js solution-builder project cancellation-token))
  (^js [solution-builder project cancellation-token write-file]
   (.build ^js solution-builder project cancellation-token write-file))
  (^js [solution-builder project cancellation-token write-file custom-transformers]
   (.build ^js solution-builder project cancellation-token write-file custom-transformers)))

(defn clean
  (^js [solution-builder]
   (.clean ^js solution-builder))
  (^js [solution-builder project]
   (.clean ^js solution-builder project)))

(defn build-references
  (^js [solution-builder project]
   (.buildReferences ^js solution-builder project))
  (^js [solution-builder project cancellation-token]
   (.buildReferences ^js solution-builder project cancellation-token))
  (^js [solution-builder project cancellation-token write-file]
   (.buildReferences ^js solution-builder project cancellation-token write-file))
  (^js [solution-builder project cancellation-token write-file custom-transformers]
   (.buildReferences ^js solution-builder project cancellation-token write-file custom-transformers)))

(defn clean-references
  (^js [solution-builder]
   (.cleanReferences ^js solution-builder))
  (^js [solution-builder project]
   (.cleanReferences ^js solution-builder project)))

(defn next-invalidated-project
  (^js [solution-builder]
   (.getNextInvalidatedProject ^js solution-builder))
  (^js [solution-builder cancellation-token]
   (.getNextInvalidatedProject ^js solution-builder cancellation-token)))
