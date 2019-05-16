package org.shop;

import org.shop.annotations.InjectRandomInt;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * The main Data Initializer util class.
 */
public class DataInitializer {

    /** The seller initializer. */
    @Autowired
    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */
    @Autowired
    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */
    @Autowired
    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */
    @Autowired
    private UserInitializer userInitializer;

    @InjectRandomInt(min = 2, max = 8)
    private int random;

    /**
     * Inits the data.
     */
    public void initData() {
        System.out.println(random);
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }
}
